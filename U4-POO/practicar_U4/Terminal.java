package practicar_U4;

public class Terminal {
    String num;
    int segs;

    public Terminal(String num) {
        this.num = num;
        this.segs = 0;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getSegs() {
        return segs;
    }

    public void setSegs(int segs) {
        this.segs = segs;
    }

    public void llama(Terminal t, int segundos){
            this.segs += segundos;
            t.setSegs(t.getSegs()+segundos);  // los que tenia antes + los nuevos
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "num=" + num +
                ", segs=" + segs +
                '}';
    }
}
