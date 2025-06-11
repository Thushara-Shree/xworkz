<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Birth Certificate</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>


<div class="d-flex justify-content-center align-items-center vh-100 ">
    <div class="border border-primary rounded p-5" >
        <h1> Death Certificate</h1>
        <form action="deathcertificate" method="POST">
            <div class="mb-3">
                <label  class="form-label ">Name</label>
                <input type="text" class="form-control" name="name" required >
            </div>

            <div class="mb-3">
            <label  class="form-label ">Cause</label>
            <input type="text" class="form-control" name="cause" required >
            </div>

            <div class="mb-3">
                <label  class="form-label ">Date</label>
                <input type="date" class="form-control" name="date" required>
            </div>
            <div class="mb-3">
                <label  class="form-label ">Time</label>
                <input type="time" class="form-control" name="time" required>
            </div>
            <div class="mb-3">
                <label  class="form-label "> Age at Death</label>
                <input type="number" class="form-control" name="age" required>
            </div>
            <div class="mb-3">
                <label  class="form-label ">Certified by</label>
                <input type="text" class="form-control" name="doctor" required>
            </div>
            <div class="mb-3">
                <label  class="form-label">Hospital Name</label>
                <input type="text" class="form-control" name="hospital" required>
            </div>

            <div class="mb-3">
            <label  class="form-label">Manner of death</label>
            <input type="text" class="form-control" name="manner" required>
            </div>

            <div class="mb-3">
                <label  class="form-label">Gender</label>
                <input type="text" class="form-control" name="gender" required>
            </div>

            <div class="mb-3">
                <label  class="form-label">Marks</label>
                <input type="text" class="form-control" name="marks" required>
            </div>

            <div class="d-grid ">
                <button type="submit" class="btn btn-primary ">Submit</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>