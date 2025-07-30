//Interfaces = Implements.
//Class = Extends.
public class Interfaces {
    public static void main (String args []){
        Queen q = new Queen ();
        q.moves();
        Rook r = new Rook ();
        System.out.println ();
        r.moves ();
        //for King create new object.
    }
}
    interface ChessPlayer{
        void moves ();
    }
    class Queen implements ChessPlayer {
        public void moves (){
            System.out.print("up,down,left,right,Diagonal (in all 4 dirms)");
    }
}
class Rook implements ChessPlayer {
    public void moves (){
        System.out.println("up,down,left,right");

    }
}
class king implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal,(by 1 step)");
    }
}