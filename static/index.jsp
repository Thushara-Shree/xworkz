<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Fitness Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />

    <style>
        body, html {
          height: 100%;
          margin: 0;
          background-color: #e9ecef;
        }

        .center-box-wrapper {
          height: calc(100vh - 56px); /* navbar height */
          display: flex;
          justify-content: center;
          align-items: center;
        }

        .custom-box {
          background-color: #fff;
          padding: 40px;
          border-radius: 12px;
          box-shadow: 0 8px 30px rgba(0, 0, 0, 0.1);
          text-align: center;
          max-width: 500px;
          width: 90%;
        }

        .custom-box h1 {
          font-size: 2.5rem;
          margin-bottom: 15px;
        }

        .custom-box p {
          font-size: 1.2rem;
          margin-bottom: 25px;
        }

        .custom-box .btn {
          padding: 10px 20px;
          font-size: 1rem;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">FitLife</a>
    </div>
</nav>

<!-- Centered Content Box -->
<div class="center-box-wrapper">
    <div class="custom-box">
        <h1>Welcome to FitLife</h1>
        <p>Your fitness journey starts here.</p>
        <a href="register.jsp" class="btn btn-primary">Register</a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
