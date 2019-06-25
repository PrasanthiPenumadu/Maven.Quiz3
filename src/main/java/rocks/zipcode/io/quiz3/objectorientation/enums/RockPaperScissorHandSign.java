package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"),PAPER("PAPER"),SCISSOR("SCISSOR");
    public String type;
    RockPaperScissorHandSign(String type){
        this.type=type;
    }
    public String getType(){return type;}
    public RockPaperScissorHandSign getWinner() {
        if((this.getType()==ROCK.type))
            return PAPER;
        else if(this.getType()==PAPER.type)
            return SCISSOR;
        else
            return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        if((this.getType()==ROCK.type))
            return SCISSOR;
        else if(this.getType()==PAPER.type)
            return ROCK;
        else
            return PAPER;

    }
}
