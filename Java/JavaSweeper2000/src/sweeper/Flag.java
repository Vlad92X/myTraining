package sweeper;

class Flag {
    private Matrix flagMap;
    private int countOfCloseBoxes;

    public void start()
    {
        flagMap=new Matrix(Box.CLOSED);
        countOfCloseBoxes=Ranges.getSize().x*Ranges.getSize().y;

    }

    public Box get(Coord coord)
    {
        return flagMap.get(coord);
    }

    void setOpenedToBox(Coord coord) {
        flagMap.set(coord,Box.OPENED);
        countOfCloseBoxes--;
    }

    public boolean toggleFlagedToBox(Coord coord) {
        switch (flagMap.get(coord))
        {
            case FLAGED:setClosedToBox(coord);return false;
            case CLOSED:setFlagedToBox(coord); return true;
            default:break;
        }
        return true;
    }


    private void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
    }

    int getCountOfClosedBoxes() {
return countOfCloseBoxes;
    }

    void setBombedToBox(Coord coord) {
        flagMap.set(coord,Box.BOMBED);
    }

    void setOpenedToClosedBombBox(Coord coord) {
        if (flagMap.get(coord)==Box.CLOSED)
            flagMap.set(coord,Box.OPENED);
    }

    void setNoBombToFlagedSafeBox(Coord coord) {
        if (flagMap.get(coord)==Box.FLAGED)
            flagMap.set(coord,Box.NOBOMB);
    }



     int getCountOfFlagedBoxesAround(Coord coord) {
        int count=0;
        for (Coord around: Ranges.getCoordsAround(coord))
            if (flagMap.get(around)== Box.FLAGED)
                count++;
         return count;
    }
}
