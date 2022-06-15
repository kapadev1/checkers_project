package pl.edu.elka.prm2t.checkers;


public abstract class Player {
    protected Board boardRef;

    Player(Board boardRef){
        this.boardRef = boardRef;
    }

    public void promoteMan(Man manToPromote){
        boardRef.removeFigure(manToPromote);
    }


    protected void createNewMen(){}

    }







