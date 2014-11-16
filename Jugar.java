class Jugar {

Jugador jug;
boolean jugando;

public Jugar (String nombre, String categoria){
	jug = new Jugador(nombre, categoria);
	jugando = true;
}


public Jugador getJugador(){
	return jug;
}

public boolean estaJugando(){
	return jugando;
}
public void perdio(){
	jugando= false;
}



}
