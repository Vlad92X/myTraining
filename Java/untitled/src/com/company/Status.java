package com.company;

public enum Status {
    NONE,   //1
    BORN,   //2
    LIVE,   //1
    OLDER,  //4
    ELDER,  //3
    DIED;   //2

    public Status step1(int around)
    {

        switch (this)
        {
            case NONE:return (around==3)?BORN:NONE;
            case LIVE:return (around<=1||around>=4)?DIED:ELDER;
            case ELDER:return (around<=1||around>=4)?DIED:OLDER;
            case OLDER:return (around<=1||around>=4)?DIED:OLDER;
            default:return this;
        }
    }


    public Status step2()
    {
        switch (this)
        {
            case BORN:return LIVE;
            case DIED:return NONE;
            default:return this;
        }
    }

    public boolean isCell(){
        return this==LIVE||this==DIED||this==OLDER||this==ELDER;
    }
}
