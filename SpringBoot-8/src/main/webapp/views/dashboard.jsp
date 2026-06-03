<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="style.css">
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