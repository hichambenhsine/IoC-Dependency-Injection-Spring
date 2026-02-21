<h2>Injection des Dépendances – Couplage Faible</h2>

<h3>Objectif</h3>
<p>Ce projet a pour objectif d’illustrer le principe de l’injection des dépendances (Dependency Injection) en Java en respectant le principe du couplage faible.</p>

<p>Nous implémentons :</p>
<ul>
  <li>Une couche DAO</li>
  <li>Une couche Métier</li>
  <li>L’injection des dépendances de trois manières :
    <ul>
      <li>Instanciation statique</li>
      <li>Instanciation dynamique</li>
      <li>Framework Spring :
        <ul>
          <li>Configuration XML</li>
          <li>Configuration par annotations</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>

<h3>Diagramme de classes</h3>
<p>Voici le diagramme représentant les relations entre les classes DAO et Métier :</p>
<img src="images/2.png" alt="Diagramme de classes"/>

<h3>Injection par instanciation statique</h3>
<p>Dans cette approche, les objets sont créés manuellement dans le code, et les dépendances sont directement injectées via le constructeur ou via setters.</p>

<h3>Injection par instanciation dynamique</h3>
<p>Cette méthode utilise la réflexion pour charger les classes dynamiquement depuis un fichier de configuration.</p>

<h3>Injection avec Spring Framework</h3>
<p>Spring permet de gérer automatiquement les dépendances via un conteneur IoC. Deux méthodes sont illustrées :</p>
<ul>
  <li>Configuration XML</li>
  <li>Configuration par annotations</li>
</ul>

