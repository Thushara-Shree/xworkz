
<!DOCTYPE html>
<html>
<head>
    <title>Theft Complaint</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(to right, #e3f2fd, #ffffff);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .form-card {
            max-width: 600px;
            width: 100%;
            border-radius: 1rem;
            box-shadow: 0 4px 20px rgba(0,0,0,0.1);
            padding: 2rem;
            background-color: white;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="form-card mx-auto">
        <h2 class="text-center text-primary mb-4">Theft Complaint Form</h2>
        <form action="theft" method="post">
            <div class="form-floating mb-3">
                <input type="text" name="name" class="form-control" id="name" placeholder="Name" required>
                <label for="name">Name</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" name="mobile" class="form-control" id="mobile" placeholder="Mobile" required>
                <label for="mobile">Mobile</label>
            </div>
            <div class="form-floating mb-3">
                <input type="number" name="age" class="form-control" id="age" placeholder="Age" required>
                <label for="age">Age</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" name="address" class="form-control" id="address" placeholder="Address" required>
                <label for="address">Address</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" name="location" class="form-control" id="location" placeholder="Location of Theft" required>
                <label for="location">Location of Theft</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" name="item" class="form-control" id="item" placeholder="Item Lost" required>
                <label for="item">Item Lost</label>
            </div>
            <div class="form-floating mb-4">
                <input type="date" name="lostOn" class="form-control" id="lostOn" placeholder="Date of Theft" required>
                <label for="lostOn">Date of Theft</label>
            </div>
            <button type="submit" class="btn btn-danger w-100 py-2">Submit Complaint</button>
        </form>
    </div>
</div>
</body>
</html>

