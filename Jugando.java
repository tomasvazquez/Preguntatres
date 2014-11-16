import java.util.ArrayList;
class Jugando{
	
public static void main(String[] args){
	String nombre= "";
	String categoria= "";

Jugar comenzar = new Jugar(nombre, categoria);//Comienza el juego

Jugador jugador= comenzar.getJugador();

Bancopreguntas banco= new Bancopreguntas();
while(comenzar.estaJugando()){ //condicion recursiva que se rompe cuando responde mal

Pregunta pregunta= banco.getPregunta(categoria);// pide la pregunta

Object[] respusuario= new Object[pregunta.getOptions()];//genera la respuesta del usuario
ArrayList<Respuesta> answer = jugador.responder(respusuario);//crea una arraylist con las respuestas del jugador
if(pregunta.esCorrecta(answer)){// evalua la respuesta
	jugador.sumarPuntaje(10);
	}
else{
	comenzar.perdio();

}
	}

	System.out.println(nombre + "Has perdido. Su puntaje es" + jugador.getPuntaje());





}

}
