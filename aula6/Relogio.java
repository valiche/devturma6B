public class Relogio {
    int hora, min, seg;

    public Relogio() {
        hora = 12;
        min = 00;
        seg = 00;
    }

    public Relogio(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Relogio(int hora, int min) {
        this.hora = hora;
        this.min = min;
    }

    public String getTime() {
        return hora + ":" + min + ":" + seg;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public void setMin(int min) {
        if (min >= 0 && min < 60) {
            this.min = min;
        }
    }

    public void setSeg(int seg) {
        if (seg >= 0 && seg < 60) {
            this.seg = seg;
        }
    }
}