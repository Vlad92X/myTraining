package sweeper;

public class Game
{
   private Bomb bomb;
   private Flag flag;
   private GameState state;
   private int countFindBomb;

    public GameState getState() {
        return state;
    }
    public int getCountFindBomb() {
        return countFindBomb;
    }



    public  Game(int cols,int rows,int bombs){
        Ranges.setSize(new Coord(cols,rows));
        bomb=new Bomb(bombs);
        flag = new Flag();
    }

    public  void start()
    {
        bomb.star();
        flag.start();
        countFindBomb=0;
        state=GameState.PLAYED;

    }
    public Box getBox (Coord coord)
    {
        if(flag.get(coord)==Box.OPENED)
            return bomb.get(coord);
        else
            return flag.get(coord);
    }

    public void pressLeftButton(Coord coord) {
        if(gameOver())return;
        openBox(coord);
        checkWinner();
    }

    private boolean gameOver() {
        if (state==GameState.PLAYED)
            return false;
        start();
        return true;
    }

    private void checkWinner()
    {
        if (state==GameState.PLAYED)
            if (flag.getCountOfClosedBoxes()==bomb.getTotalBombs())
                state=GameState.WINNER;

    }

    private void openBox(Coord coord){
        switch (flag.get(coord)){

            case OPENED:setOpenedToClosedBoxesAroundNumber(coord);return;
            case FLAGED:return;
            case CLOSED:
                switch (bomb.get(coord)){
                    case ZERO:openBoxesAround(coord);return;
                    case BOMB:OpenBombs(coord);return;
                    default:flag.setOpenedToBox(coord);return;
                }
        }
    }

    private void setOpenedToClosedBoxesAroundNumber(Coord coord) {
        if (bomb.get(coord)!=Box.BOMB)
            if(flag.getCountOfFlagedBoxesAround(coord)==bomb.get(coord).getNumber())
                for (Coord around: Ranges.getCoordsAround(coord))
                    if (flag.get(around)==Box.CLOSED)
                        openBox(around);
    }

    private void OpenBombs(Coord bombed) {
        state=GameState.BOMBED;
        flag.setBombedToBox(bombed);
        for (Coord coord: Ranges.getAllCoords())
            if(bomb.get(coord)==Box.BOMB)
                flag.setOpenedToClosedBombBox(coord);
            else
                flag.setNoBombToFlagedSafeBox(coord);


    }

    private void openBoxesAround(Coord coord) {
        flag.setOpenedToBox(coord);
        for (Coord around: Ranges.getCoordsAround(coord))
            openBox(around);
    }


    public void pressRigthButton(Coord coord) {
        if(gameOver());

        if (bomb.get(coord)==Box.BOMB){
            if (flag.toggleFlagedToBox(coord)){countFindBomb++;}
            else {countFindBomb--;}
        }
        else flag.toggleFlagedToBox(coord);

    }

}
