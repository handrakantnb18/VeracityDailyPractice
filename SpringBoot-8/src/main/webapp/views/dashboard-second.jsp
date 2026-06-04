<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="style.css">
    
    <style type="text/css">
    
    
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f4f6f9;
}

.container{
    display:flex;
    min-height:100vh;
}

/* Sidebar */
.sidebar{
    width:250px;
    background:#1e3a8a;
    color:white;
    padding:20px;
}

.sidebar h2{
    text-align:center;
    margin-bottom:30px;
}

.sidebar ul{
    list-style:none;
}

.sidebar ul li{
    margin:15px 0;
}

.sidebar ul li a{
    color:white;
    text-decoration:none;
    display:block;
    padding:10px;
    border-radius:5px;
    transition:0.3s;
}

.sidebar ul li a:hover{
    background:#3b82f6;
}

/* Main Content */
.main-content{
    flex:1;
    padding:20px;
}

/* Header */
.header{
    display:flex;
    justify-content:space-between;
    align-items:center;
    margin-bottom:30px;
}

.profile{
    background:white;
    padding:10px 20px;
    border-radius:5px;
    box-shadow:0 2px 5px rgba(0,0,0,0.1);
}

/* Cards */
.cards{
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(200px,1fr));
    gap:20px;
    margin-bottom:30px;
}

.card{
    background:white;
    padding:25px;
    border-radius:10px;
    text-align:center;
    box-shadow:0 3px 8px rgba(0,0,0,0.1);
}

.card h3{
    color:#555;
    margin-bottom:10px;
}

.card p{
    font-size:28px;
    font-weight:bold;
    color:#1e3a8a;
}

/* Table */
.table-section{
    background:white;
    padding:20px;
    border-radius:10px;
    box-shadow:0 3px 8px rgba(0,0,0,0.1);
}

.table-section h2{
    margin-bottom:15px;
}

table{
    width:100%;
    border-collapse:collapse;
}

table th{
    background:#1e3a8a;
    color:white;
    padding:12px;
}

table td{
    padding:12px;
    border-bottom:1px solid #ddd;
}

table tr:hover{
    background:#f1f5f9;
}
    
    </style>
</head>
<body>

<div class="container">

    <!-- Sidebar -->
    <div class="sidebar">
        <h2>Dashboard</h2>

        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">Students</a></li>
            <li><a href="#">Courses</a></li>
            <li><a href="#">Reports</a></li>
            <li><a href="#">Settings</a></li>
            <li><a href="#">Logout</a></li>
        </ul>
    </div>

    <!-- Main Content -->
    <div class="main-content">

        <div class="header">
            <h1>Admin Dashboard</h1>
            <div class="profile">
                Welcome, Admin
            </div>
            <div class="profile">
                Log Out
            </div>
        </div>
        

        <!-- Cards -->
        <div class="cards">
            <div class="card">
                <h3>Total Students</h3>
                <p>1,250</p>
            </div>

            <div class="card">
                <h3>Total Courses</h3>
                <p>45</p>
            </div>

            <div class="card">
                <h3>Faculty</h3>
                <p>78</p>
            </div>

            <div class="card">
                <h3>Revenue</h3>
                <p>₹2,50,000</p>
            </div>
        </div>

        <!-- Table -->
        <div class="table-section">
            <h2>Recent Enrollments</h2>

            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Course</th>
                    <th>Status</th>
                </tr>

                <tr>
                    <td>101</td>
                    <td>Rahul Sharma</td>
                    <td>Java Full Stack</td>
                    <td>Active</td>
                </tr>

                <tr>
                    <td>102</td>
                    <td>Priya Patil</td>
                    <td>Python</td>
                    <td>Active</td>
                </tr>

                <tr>
                    <td>103</td>
                    <td>Amit Kumar</td>
                    <td>Data Science</td>
                    <td>Pending</td>
                </tr>

                <tr>
                    <td>104</td>
                    <td>Sneha Joshi</td>
                    <td>Spring Boot</td>
                    <td>Active</td>
                </tr>
            </table>
        </div>

    </div>

</div>

</body>
</html>