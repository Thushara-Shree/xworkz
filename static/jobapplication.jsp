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

<form action="JobApplication" method="post">
    <div class="mb-3">
        <label for="exampleInputName1" class="form-label">Name </label>
        <input type="text" class="form-control" id="exampleInputName1" aria-describedby="nameHelp" name="name">

    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">

    </div>
    <div class="mb-3">

        <label for="exampleInputEducation1" class="form-label">Education
        <select name="education" id="exampleInputEducation1" >
            <option>Select</option>
            <option>B.E</option>
            <option>B.E</option>
            <option>BCA</option>
            <option>MCA</option>
            <option>MBBS</option>
        </select>
        </label>
    </div>

        <div class="mb-3">
            <label for="exampleInputSkill1" class="form-label">Skills</label>
            <input type="text" class="form-control" id="exampleInputSkill1" aria-describedby="emailtext" name="skills">

        </div>

        <div class="mb-3">
            <label for="exampleInputSalary1" class="form-label">Expected Salary</label>
            <input type="text" class="form-control" id="exampleInputSalary1" aria-describedby="Salary" name="expectedSalary">

        </div>

        <div class="mb-3">
            <label for="exampleInputExperience1" class="form-label">Experience
            <select name="experience" id="exampleInputExperience1">
                <option>0</option>
                <option>1</option>
                <option>2</option>
                <option>5</option>
                <option>10</option>
            </select>
            </label>

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