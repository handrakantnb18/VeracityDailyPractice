<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Our Courses</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
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
    font-weight:bold;
}

.nav-links a:hover{
    color:#fbbf24;
}

/* Page Header */
.header{
    text-align:center;
    padding:50px 20px;
    background:linear-gradient(to right,#dbeafe,#eff6ff);
}

.header h1{
    color:#1e3a8a;
    margin-bottom:10px;
}

.header p{
    color:#555;
    font-size:18px;
}

/* Courses */
.course-container{
    display:flex;
    justify-content:center;
    flex-wrap:wrap;
    gap:25px;
    padding:50px 20px;
}

.course-card{
    width:320px;
    background:white;
    border-radius:12px;
    overflow:hidden;
    box-shadow:0 4px 10px rgba(0,0,0,0.15);
}

.course-card img{
    width:100%;
    height:200px;
    object-fit:cover;
}

.course-content{
    padding:20px;
}

.course-content h3{
    color:#1e3a8a;
    margin-bottom:10px;
}

.course-content p{
    color:#555;
    line-height:1.6;
    margin-bottom:10px;
}

.fees{
    color:#16a34a;
    font-size:20px;
    font-weight:bold;
}

.duration{
    color:#f97316;
    font-weight:bold;
}

.enroll-btn{
    display:block;
    text-align:center;
    margin-top:15px;
    padding:12px;
    background:#1e3a8a;
    color:white;
    text-decoration:none;
    border-radius:5px;
}

.enroll-btn:hover{
    background:#2563eb;
}

/* Footer */
.footer{
    background:#1e3a8a;
    color:white;
    text-align:center;
    padding:15px;
}

</style>

</head>

<body>

<!-- Navbar -->

<div class="navbar">

<div class="logo">Course Enroll</div>

<div class="nav-links">
    <a href="/">Home</a>
    <a href="cources">Courses</a>
    <a href="#">About</a>
    <a href="#">Contact</a>
</div>

</div>

<!-- Header -->

<div class="header">
    <h1>Our Professional Courses</h1>
    <p>Choose the right course and start your IT career journey.</p>
</div>

<!-- Courses -->

<div class="course-container">

<!-- Java -->
<div class="course-card">

    <img src="https://images.unsplash.com/photo-1515879218367-8466d910aaa4" alt="Java Full Stack">

    <div class="course-content">

        <h3>Java Full Stack</h3>

        <p>
            Learn Core Java, Advanced Java, Spring Boot,
            Hibernate, MySQL, HTML, CSS and JavaScript.
        </p>

        <p class="duration">Duration: 6 Months</p>

        <p class="fees">Fees: ₹45,000</p>

        <a href="enroll" class="enroll-btn">Enroll Now</a>

    </div>

</div>

<!-- Python -->

<div class="course-card">

    <img src="https://images.unsplash.com/photo-1526379095098-d400fd0bf935" alt="Python Full Stack">

    <div class="course-content">

        <h3>Python Full Stack</h3>

        <p>
            Master Python, Django, REST API,
            HTML, CSS, JavaScript and Database concepts.
        </p>

        <p class="duration">Duration: 5 Months</p>

        <p class="fees">Fees: ₹40,000</p>

        <a href="enroll" class="enroll-btn">Enroll Now</a>

    </div>

</div>

<!-- Data Science -->

<div class="course-card">

    <img src="https://images.unsplash.com/photo-1551288049-bebda4e38f71" alt="Data Science">

    <div class="course-content">

        <h3>Data Science</h3>

        <p>
            Learn Python, Machine Learning,
            Data Analytics, Pandas, NumPy and Power BI.
        </p>

        <p class="duration">Duration: 8 Months</p>

        <p class="fees">Fees: ₹55,000</p>

        <a href="enroll" class="enroll-btn">Enroll Now</a>

    </div>

</div>

<!-- AWS -->

<div class="course-card">

    <img src="https://images.unsplash.com/photo-1451187580459-43490279c0fa" alt="AWS Cloud">

    <div class="course-content">

        <h3>AWS Cloud Computing</h3>

        <p>
            Learn EC2, S3, IAM, VPC, Load Balancer,
            Auto Scaling and DevOps basics.
        </p>

        <p class="duration">Duration: 4 Months</p>

        <p class="fees">Fees: ₹35,000</p>

        <a href="enroll" class="enroll-btn">Enroll Now</a>

    </div>

</div>
<!-- React JS -->

<div class="course-card">

    <img src="https://images.unsplash.com/photo-1633356122544-f134324a6cee" alt="React JS">

    <div class="course-content">

        <h3>React JS Development</h3>

        <p>
            Learn React JS, Components, Hooks, Routing,
            Redux, API Integration and Project Development.
        </p>

        <p class="duration">Duration: 3 Months</p>

        <p class="fees">Fees: ₹25,000</p>

        <a href="enroll" class="enroll-btn">Enroll Now</a>

    </div>

</div>

<!-- DevOps -->

<div class="course-card">

    <img src="https://images.unsplash.com/photo-1667372393119-3d4c48d07fc9" alt="DevOps">

    <div class="course-content">

        <h3>DevOps Engineering</h3>

        <p>
            Learn Git, GitHub, Docker, Jenkins,
            Kubernetes, CI/CD Pipelines and AWS DevOps.
        </p>

        <p class="duration">Duration: 5 Months</p>

        <p class="fees">Fees: ₹50,000</p>

        <a href="enroll" class="enroll-btn">Enroll Now</a>

    </div>

</div>

</div>

<!-- Footer -->

<div class="footer">
    © 2026 Course Enrollment Portal | All Rights Reserved
</div>

</body>
</html>
