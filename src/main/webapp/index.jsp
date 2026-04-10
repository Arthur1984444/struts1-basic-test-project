<!DOCTYPE HTML>
<html>
<head>
<title>
test struts1
</title>
</head>
<body>
    <h2>Accueil</h2>

    <form action="hello.do" method="post">
        <input type="submit" value="Dire bonjour"/>
    </form>
    <br>
    <form action="message.do" method="get">
        <textarea name="message" rows="4" cols="50"></textarea>
        <br>
        <br>
        <input type="submit" value="envoyer message"/>
    </form>
</body>
</html>