<%-- 
    Document   : home
    Created on : 2 Mar, 2025, 9:27:03 PM
    Author     : admin
--%>

<%-- 
    Document   : home
    Created on : 2 Mar, 2025, 9:11:48 PM
    Author     : admin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String email = (String) session.getAttribute("email");
    if (email == null || email.trim().equals("")) {
        response.sendRedirect("login.html");
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            height: 100vh;
            background: linear-gradient(to left, #f8f5eb, #e6dac5, #d4b998, #c9a275);
            font-family: 'Poppins', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            text-align: center;
            padding: 20px;
            overflow: auto;
        }

        .content {
            max-width: 800px;
            padding: 20px;
            font-size: 24px;
            color: #333;
            line-height: 1.8;
           
        }

        #explore-btn {
            padding: 15px 40px;
            margin-top: 40px;
            font-size: 20px;
            border: none;
            border-radius: 30px;
            background-color: #ff8c00;
            color: white;
            cursor: pointer;
            opacity: 0;
            transition: opacity 0.5s ease, transform 0.3s ease;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
            display: none;
        }

        #explore-btn:hover {
            background-color: #e67e00;
            transform: scale(1.05);
        }

        @media (max-width: 768px) {
            .content {
                font-size: 18px;
            }

            #explore-btn {
                font-size: 18px;
                padding: 12px 30px;
            }
        }
    </style>
</head>
<body onclick="showAll()">

    <div class="content" id="paragraph-container"></div>

    <button id="explore-btn" onclick="location.href='index.jsp'">Explore</button>

    <script>
        const paragraphs = [
            "Our electronic book-keeping system offers a smart way to store, organize, and access eBooks anytime, anywhere. It replaces traditional book management with a secure, digital solution for effortless reading.",
            "The system features advanced search, easy categorization, and instant access to books. With strong data protection, your collection stays safe, organized, and readily available.",
            "Designed for modern readers, the system promotes eco-friendly reading by reducing physical storage. It’s a convenient, sustainable solution for managing books efficiently."
        ];

        const container = document.getElementById('paragraph-container');
        const exploreBtn = document.getElementById('explore-btn');

        let paragraphIndex = 0;
        let isAnimationSkipped = false;

        function displayParagraph(paragraph, callback) {
            const paragraphDiv = document.createElement("p");
            container.appendChild(paragraphDiv);

            const words = paragraph.split(" ");
            let wordIndex = 0;

            const interval = setInterval(() => {
                if (isAnimationSkipped) {
                    clearInterval(interval);
                    return;
                }

                if (wordIndex < words.length) {
                    paragraphDiv.innerHTML += words[wordIndex] + " ";
                    wordIndex++;
                } else {
                    clearInterval(interval);
                    if (callback) callback();
                }
            }, 200);
        }

        function startParagraphs() {
            if (paragraphIndex < paragraphs.length) {
                displayParagraph(paragraphs[paragraphIndex], () => {
                    paragraphIndex++;
                    setTimeout(startParagraphs, 1000);
                });
            } else {
                exploreBtn.style.opacity = 1;
                exploreBtn.style.display = "block";
            }
        }

        function showAll() {
            if (!isAnimationSkipped) {
                isAnimationSkipped = true;
                container.innerHTML = "";  // Clear existing content
                paragraphs.forEach(paragraph => {
                    const p = document.createElement("p");
                    p.textContent = paragraph;
                    container.appendChild(p);
                });

                exploreBtn.style.opacity = 1;
                exploreBtn.style.display = "block";
            }
        }

        window.onload = () => {
            setTimeout(startParagraphs, 500);
        };
    </script>

</body>
</html>

