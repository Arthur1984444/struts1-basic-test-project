# struts1test


# EN :

a small struts web project to understand the basics


## Dependencies repository maven
(https://repo.maven.apache.org/maven2/struts/struts/)




# FR :

# Définitions

## Javabean
Un JavaBean est une classe Java standardisée conçue pour être un composant logiciel réutilisable.  Elle suit des conventions strictes :
- Constructeur sans argument : Elle doit posséder un constructeur public par défaut.
  ####
- Accesseurs (Getters) et Mutateurs (Setters) : Les propriétés (champs privés) sont accessibles via des méthodes publiques nommées getNomPropriete() et setNomPropriete().
####
- Sérialisable (optionnel mais courant) : Elle implémente souvent l'interface Serializable pour permettre la persistance de son état.
###
Son but principal est d'encapsuler des données (comme les champs d'un formulaire ou des enregistrements de base de données) en un seul objet, facilitant ainsi leur manipulation, leur transfert (par exemple, entre une servlet et une JSP) et leur réutilisation dans différentes parties d'une application.

## web.xml vs struts-config.xml
web.xml agit comme le descripteur de déploiement standard de l'application web, servant à créer la connexion entre le conteneur web et l'application, et est lu par le conteneur lors du démarrage du serveur.  struts-config.xml, en revanche, est le descripteur de déploiement spécifique à l'application Struts 1, utilisé pour établir la connexion entre la vue et le contrôleur, et est lu par la méthode init() de la servlet ActionServlet.

Les différences principales résident dans leur rôle et leur moment de chargement :

web.xml définit la servlet ActionServlet et son mapping d'URL (généralement *.do), agissant comme le point d'entrée unique du framework pour le conteneur.
struts-config.xml configure les mappages d'actions spécifiques, les formulaires (ActionForms), les résultats et les redirections, définissant ainsi la logique métier et les vues du modèle MVC.
Le flux de fonctionnement est séquentiel : lorsque le serveur démarre, le conteneur lit web.xml pour charger et mapper la servlet ActionServlet, qui initie ensuite le chargement de struts-config.xml pour déterminer comment traiter les requêtes entrantes vers les actions définies. 