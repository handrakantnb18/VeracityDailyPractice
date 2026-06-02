<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Enrollment Portal</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,sans-serif;
}

body{
    background:#f4f7f9;
}

/* Navbar */
.navbar{
    background:#1e3a8a;
    padding:15px 40px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.logo{
    color:white;
    font-size:24px;
    font-weight:bold;
}

.nav-links a{
    color:white;
    text-decoration:none;
    margin-left:25px;
    font-size:17px;
    font-weight:bold;
}

.nav-links a:hover{
    color:#fbbf24;
}

/* Hero Section */
.hero{
    text-align:center;
    padding:100px 20px;
    background:linear-gradient(to right,#dbeafe,#eff6ff);
}

.hero-content{
    max-width:800px;
    margin:auto;
}

.hero-content h1{
    color:#1e3a8a;
    font-size:48px;
    margin-bottom:20px;
}

.hero-content p{
    color:#374151;
    font-size:20px;
    line-height:1.8;
    margin-bottom:30px;
}

.enroll-btn{
    background:#f97316;
    color:white;
    text-decoration:none;
    padding:14px 30px;
    border-radius:8px;
    font-size:18px;
    font-weight:bold;
    display:inline-block;
}

.enroll-btn:hover{
    background:#ea580c;
}

/* Courses */
.courses{
    padding:60px 20px;
    text-align:center;
}

.courses h2{
    color:#1e3a8a;
    margin-bottom:35px;
}

.course-box{
    display:inline-block;
    width:280px;
    background:white;
    margin:15px;
    padding:25px;
    border-radius:10px;
    box-shadow:0px 2px 8px rgba(0,0,0,0.15);
    vertical-align:top;
    transition:0.3s;
}

.course-box h3{
    color:#2563eb;
    margin-bottom:15px;
}

.course-box p{
    color:#555;
    line-height:1.5;
    margin-bottom:15px;
}

.course-box:hover{
    transform:translateY(-5px);
    box-shadow:0px 5px 15px rgba(0,0,0,0.2);
}

/* Footer */
.footer{
    background:#1e3a8a;
    color:white;
    text-align:center;
    padding:15px;
    margin-top:30px;
}

</style>
</head>

<body>

<!-- Navbar -->
<div class="navbar">
    <div class="logo">Course Enroll</div>

    <div class="nav-links">
        <a href="#">Home</a>
        <a href="cources">Courses</a>
        <a href="#">About</a>
        <a href="#">Contact</a>
        <a href="enroll">Enroll Now</a>
    </div>
</div>

<!-- Hero Section -->
<div class="hero">
    <div class="hero-content">
        <h1>Upgrade Your Skills Today</h1>

        <p>
            Learn Java Full Stack, Python Full Stack, and Data Science
            from experienced trainers. Build real-world projects and
            prepare yourself for a successful IT career.
        </p>

        <a href="enroll" class="enroll-btn">
            Enroll Now
        </a>
    </div>
</div>

<!-- Courses Section -->
<!-- Courses Section -->
<div class="courses" id="courses">

    <h2>Popular Courses</h2>

    <div class="course-box">
        <h3>Java Full Stack</h3>
        <p>Spring Boot, Hibernate, MySQL, HTML, CSS, JavaScript.</p>
        <a href="enroll" class="enroll-btn">Enroll Now</a>
    </div>

    <div class="course-box">
        <h3>Python Full Stack</h3>
        <p>Django, REST API, Python, HTML, CSS, JavaScript.</p>
        <a href="enroll" class="enroll-btn">Enroll Now</a>
    </div>

    <div class="course-box">
        <h3>Data Science</h3>
        <p>Machine Learning, Python, Pandas, NumPy, Power BI.</p>
        <a href="enroll" class="enroll-btn">Enroll Now</a>
    </div>

    <div class="course-box">
        <h3>AWS Cloud Computing</h3>
        <p>EC2, S3, IAM, VPC, Load Balancer and Cloud Deployment.</p>
        <a href="enroll" class="enroll-btn">Enroll Now</a>
    </div>

    <div class="course-box">
        <h3>React JS</h3>
        <p>Components, Hooks, Routing, Redux and API Integration.</p>
        <a href="enroll" class="enroll-btn">Enroll Now</a>
    </div>

    <div class="course-box">
        <h3>DevOps</h3>
        <p>Git, GitHub, Docker, Jenkins, Kubernetes and CI/CD.</p>
        <a href="enroll" class="enroll-btn">Enroll Now</a>
    </div>

</div>
<!-- Footer -->
<div class="footer">
    © 2026 Course Enrollment Portal | All Rights Reserved
</div>

</body>
</html>