package ar.reloadersystem.animationcircularviewholder;

public class Lugares {

    private String titulo;

    private String descripcion;
    private int photoimage;

    public Lugares() {

    }

    public Lugares(String titulo, String descripcion, int photoimage) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.photoimage = photoimage;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPhotoimage() {
        return photoimage;
    }

    public void setPhotoimage(int photoimage) {
        this.photoimage = photoimage;
    }
}
