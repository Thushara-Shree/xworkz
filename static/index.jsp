<!DOCTYPE html>
<html>
<head>
    <title>Police Station Complaint Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #e0eafc, #cfdef3);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .card {
            border-radius: 1rem;
            box-shadow: 0 4px 20px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>
<div class="container">
    <div class="card p-5 text-center">
        <h1 class="mb-4 text-primary">Police Station Complaint Portal</h1>
        <div class="d-grid gap-3 col-8 mx-auto">
            <a href="theft.jsp" class="btn btn-outline-danger btn-lg">File a Theft Complaint</a>
            <a href="missingperson.jsp" class="btn btn-outline-warning btn-lg">Report Missing Person</a>
        </div>
    </div>
</div>
</body>
</html>
