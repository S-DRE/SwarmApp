package pmdm.swarmteam.swarm_app;

public class Noticia {

    public int id;
    public String titular, preview;

    public Noticia(int id, String titular, String preview) {
        this.id = id;
        this.titular = titular;
        this.preview = preview;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public String getPreview() {
        return preview;
    }
}
