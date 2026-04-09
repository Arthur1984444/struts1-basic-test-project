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
    <form action="message.do" method="get">
        <textarea name="message" rows="4" cols="50"></textarea>
        <input type="submit" value="envoyer message"/>
    </form>
</body>
</html>