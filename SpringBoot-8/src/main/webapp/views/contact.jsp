<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f7f9;
        margin: 0;
        padding: 0;
    }

    .container {
        width: 40%;
        margin: 60px auto;
        background: #fff;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #1e3a8a;
    }

    input, textarea {
        width: 100%;
        padding: 10px;
        margin-top: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    textarea {
        resize: none;
        height: 120px;
    }

    button {
        width: 100%;
        padding: 10px;
        margin-top: 15px;
        background: #1e3a8a;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    button:hover {
        background: #0f2557;
    }

    .info {
        text-align: center;
        margin-top: 15px;
        color: #555;
        font-size: 14px;
    }
</style>

</head>

<body>

<div class="container">
    <h2>Contact Us</h2>

    <form action="contactSubmit" method="post">
        <input type="text" name="name" placeholder="Your Name" required>

        <input type="email" name="email" placeholder="Your Email" required>

        <input type="text" name="subject" placeholder="Subject" required>

        <textarea name="message" placeholder="Your Message" required></textarea>

        <button type="submit">Send Message</button>
    </form>

    <div class="info">
        We will get back to you within 24 hours.
    </div>
</div>

</body>
</html>