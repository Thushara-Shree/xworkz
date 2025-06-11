<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>
<h1>Hello, world!</h1>

<!-- Optional JavaScript; choose one of the two! -->

<form action="drivingLicense" method="post">
    <div class="mb-3">
        <label for="exampleInputName1" class="form-label">Name </label>
        <input type="text" class="form-control" id="exampleInputName1" aria-describedby="nameHelp" name="name">

        <div class="mb-3">
            <label for="exampleInputaddress1" class="form-label">Address</label>
            <input type="text" class="form-control" id="exampleInputaddress1" aria-describedby="address" name="address">

        </div>

        <div class="mb-3">

            <label for="exampleInputMobile1" class="form-label">Mobile No</label>
            <input type="number" class="form-control" id="exampleInputMobile1" aria-describedby="mobile" name="mobile">
        </div>

        <div class="mb-3">
            <label for="exampleInputDate1" class="form-label">Applied Date</label>
            <input type="date" class="form-control" id="exampleInputDate1" aria-describedby="date" name="date">

        </div>

        <div class="mb-3">
            <label for="exampleInputType1" class="form-label">Vehicle Type</label>
            <input type="text" class="form-control" id="exampleInputType1" aria-describedby="type" name="type">

        </div>



        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
</form>

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
-->
</body>
</html>