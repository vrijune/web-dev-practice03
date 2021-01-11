<%--
  Created by IntelliJ IDEA.
  User: tcro142
  Date: 7/01/2020
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../site.css">
</head>
<body>

<div id="header">

    <h1>Exercise Two Form</h1>

</div>

<div id="main">


    <form action="/likes-submission" method="get">

        T-Rex<input type="hidden" value="T-Rex" name="dinosaurName"><br>
        Rating: <select name="dinosaurRating">
        <option value="favourite">Favourite</option>
        <option value="like">Like</option>
        <option value="dislike">Dislike</option>
    </select><br>
        Notes: <input type="text" name="dinosaurNotes"><br><br>

        Stegosaurus<input type="hidden" value="Stegosaurus" name="dinosaurName"><br>
        Rating: <select name="dinosaurRating">
        <option value="favourite">Favourite</option>
        <option value="like">Like</option>
        <option value="dislike">Dislike</option>
    </select><br>
        Notes: <input type="text" name="dinosaurNotes"><br><br>

        Triceratops<input type="hidden" value="Triceratops" name="dinosaurName"><br>
        Rating: <select name="dinosaurRating">
        <option value="favourite">Favourite</option>
        <option value="like">Like</option>
        <option value="dislike">Dislike</option>
    </select><br>
        Notes: <input type="text" name="dinosaurNotes"><br><br>

        Velociraptor<input type="hidden" value="Velociraptor" name="dinosaurName"><br>
        Rating: <select name="dinosaurRating">
        <option value="favourite">Favourite</option>
        <option value="like">Like</option>
        <option value="dislike">Dislike</option>
    </select><br>
        Notes: <input type="text" name="dinosaurNotes"><br><br>

        Brachiosaurus<input type="hidden" value="Brachiosaurus" name="dinosaurName"><br>
        Rating: <select name="dinosaurRating">
        <option value="favourite">Favourite</option>
        <option value="like">Like</option>
        <option value="dislike">Dislike</option>
    </select><br>
        Notes: <input type="text" name="dinosaurNotes"><br><br>

        <input type="submit" value="Submit">

    </form>

</div>

</body>
</html>
