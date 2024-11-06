package Matricula.Model;

// Enum para representar os turnos
public enum Turno {
    MATUTINO("Matutino"),
    VESPERTINO("Vespertino"),
    NOTURNO("Noturno");

    private final String descricao;

    Turno(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Turno fromString(String turno) {
        switch (turno.toLowerCase()) {
            case "m":
                return MATUTINO;
            case "v":
                return VESPERTINO;
            case "n":
                return NOTURNO;
            default:
                throw new IllegalArgumentException("Turno inválido: " + turno);
        }
    }
}