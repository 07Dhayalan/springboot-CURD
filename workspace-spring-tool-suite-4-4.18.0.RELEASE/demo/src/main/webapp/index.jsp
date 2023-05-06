<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="adduser">
        Enter id <input type="text" name="id"> <br>
        Enter name <input type="text" name="name"> <br>
        <input type="submit">
    </form>
    <h2>Display user information </h2>
    <form action="getuser">
        Enter id <input type="text" name="id"> <br>
      
        <input type="submit">
    </form>
    <h2>Enter details to delete</h2>
    <form action="deleteuser">
        Enter id <input type="text" name="id"> <br>
      
        <input type="submit">
    <h2>Enter update details </h2>
    <form action="updateuser">
        Enter id <input type="text" name="id"> <br>
          
        <input type="submit">   
    </form>
</body>
</html>