<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <title>Fitness Registration</title>

    <style>
        body, html {
            height: 100%;
        }

        .center-form-container {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f5f5f5;
        }

        .form-box {
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }
    </style>
</head>
<body>

<div class="center-form-container">
    <form action="Register" method="post" class="form-box">

        <h3 class="text-center mb-4">Fitness Registration</h3>

        <div class="mb-3">
            <label for="exampleInputName1" class="form-label">Name </label>
            <input type="text" class="form-control" id="exampleInputName1" name="name">
        </div>

        <div class="mb-3">
            <label for="exampleInputAge1" class="form-label">Age </label>
            <input type="number" class="form-control" id="exampleInputAge1" name="age">
        </div>

        <div class="mb-3">
            <label for="exampleInputPhone1" class="form-label">Phone Number </label>
            <input type="number" class="form-control" id="exampleInputPhone1" name="number">
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name="email">
        </div>

        <div class="mb-3">
            <label for="exampleInputblood1" class="form-label">Blood Group</label>
            <select name="bloodGrp" id="exampleInputblood1" class="form-select">
                <option>Select</option>
                <option>A+</option>
                <option>A-</option>
                <option>B+</option>
                <option>B-</option>
                <option>O+</option>
                <option>O-</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="exampleInputAddress1" class="form-label">Address</label>
            <input type="text" class="form-control" id="exampleInputAddress1" name="address">
        </div>

        <div class="mb-3">
            <label for="exampleInputCity1" class="form-label">City</label>
            <input type="text" class="form-control" id="exampleInputCity1" name="city">
        </div>

        <div class="mb-3">
            <label class="form-label">Want a subscription?</label>
            <div>
                <input type="radio" id="yes" name="interested" value="true">
                <label for="yes">Yes</label>

                <input type="radio" id="no" name="interested" value="false">
                <label for="no">No</label>
            </div>
        </div>


        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </form>
</div>

<!-- Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

