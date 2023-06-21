package examen3.pregunta1;
public class Carnet {

    public final String dni;
    public String nombre;
    public int dia, mes, año;
    
    public Carnet(String dni, String nombre, int dia, int mes, int año) throws Exception {
        if (checkDni(dni))
            this.dni = dni;
        else
            throw new Exception("Error: El dni no es válido");
        setNombre(nombre);
        setDia(dia);
        setMes(mes);
        setAño(año);
    }

    private boolean checkDni(String dni) {
        char letra = dni.charAt(dni.length() - 1);
        if (letra < 'A' || letra > 'Z')
            return false;
        try {
            int num = Integer.valueOf((String)dni.subSequence(0, dni.length() - 2));
            if (num <= 0)
                return false;
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.split(" ").length <= 1)
            throw new Exception("Error: el nombre no es válido");
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if (dia < 1 || dia > 30)
            throw new Exception("Error: el dia no es válido");
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if (mes < 1 || mes > 12)
            throw new Exception("Error: el mes no es válido");
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) throws Exception {
        if (año <= 1900)
            throw new Exception("Error: el año no es válido");
        this.año = año;
    }

    @Override
    public String toString() {
        return ("DNI: " + dni + ", Nombre: " + nombre + ", Nacimiento: " + dia + "/" + mes + "/" + año);
    }

}