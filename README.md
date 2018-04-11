# Patrones-Creacionales
Aplicación que implementa los patrones creacionales, en base al prototype

GUERREROS EN LINEA!

Nuestra idea de aplicación es un juego de batallas con 3 personajes/guerreros y un objetivo para destruir en dos líneas interactivas, estos guerreros usaran una mecánica (piedra, papel, tijera), cada usuario seleccionara un guerrero y lo colocara en una de dos líneas, cada línea tiene un objetivo de victoria, si un jugador destruye un objetivo de cualquiera de las dos líneas ganará la partida.

Primero se hará introducción de una “economía”, iniciamos con un oro predeterminado suficiente para comprar cierto número de tropas, cuando empiece el combate las tropas tendrán ventajas y desventajas sobre cierto tipo de tropa en la que venciendo a un guerrero rival se ganará oro y con este oro podremos crear nuevos guerreros, debido a esto es importante tener cuidado con las tropas que usamos, ya que podríamos quedarnos sin oro si no jugamos bien nuestras tropas y el rival podría destruir el objetivo.

Una vez empiece la batalla colocaremos nuestras tropas en una línea, estas se irán abriendo camino al objetivo, nuestro rival usara el “Counter” más apropiado para la primera tropa que este en fila si tiene suficiente oro para costearla, en caso contrario puede jugar la tropa que tenga igual o menos posibilidades para vencerla pero igual causando daño a la tropa atacante, el objetivo es llegar al final de la linea y destruir el objetivo, no debemos olvidar que nuestro rival puede atacar por la segunda línea y tener un camino directo a la victoria, por esto es importante jugar las tropas adecuadas tanto en defensa como en ataque, cuida el oro y tu objetivo, mientras mejor cumplas esta regla más posibilidades hay de ganar.

Diagrama de clases Patrones: Protoype, "Singleton" Y FACTORY METHOD  Juego
![DiagramaJuego.png](https://github.com/CarlosLopez98/Patrones-Creacionales/blob/master/DiagramaJuego.png)
