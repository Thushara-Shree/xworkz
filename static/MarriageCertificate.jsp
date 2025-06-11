<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Marriage Certificate</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>


<div class="d-flex justify-content-center align-items-center  ">
    <div class="border border-primary rounded p-5" >
        <h1>Passport</h1>
        <form action="marriagecertificate" method="POST">
            <div class="mt-3">
                <label  class="form-label ">Groom Name :</label>
                <input type="text" class="form-control" name="groomName" required >
            </div>

            <div class="mt-3">
                <label  class="form-label ">Bride Name :</label>
                <input type="text" class="form-control" name="brideName" required >
            </div>

            <div class="mb-3">
                <label  class="form-label ">Location</label>
                <input type="text" class="form-control" name="location" required>
            </div>
            <div class="mb-3">
                <label  class="form-label ">Address</label>
                <input type="text" class="form-control" name="address" required>
            </div>

            <label  class="form-label ">Religion</label>
            <select name="religion" >
                <option>Hindu</option>
                <option>Muslim</option>
                <option>Catholic</option>
                <option>Atheist</option>

            </select>
            <div class="mb-3">
                <label  class="form-label">Date</label>
                <input type="date" class="form-control" name="date" required>
            </div>
            <div class="mb-3">
                <label  class="form-label">Witness 1</label>
                <input type="text" class="form-control" name="witness1" required>
            </div>

            <div class="mb-3">
                <label  class="form-label">Witness 2</label>
                <input type="text" class="form-control" name="witness2" required>
            </div>

            <div class="mb-3">
                <label  class="form-label">Officer Present</label>
                <input type="text" class="form-control" name="officer" required>
            </div>

            <div class="d-grid ">
                <button type="submit" class="btn btn-primary ">Submit</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>