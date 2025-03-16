package lol.fmg.hub.models.enums;

public enum StructureTypeEnum {
    ENTREPRISE("Entreprise"),
    ENTREPRISE_TECHNOLOGIQUE("Entreprise technologique"),
    EDITEUR_DE_JEUX("Éditeur de jeux"),
    MARQUE_SPONSOR("Marque et/ou sponsor"),
    MEDIA_STREAMING("Média et/ou plateforme de streaming"),
    ORGANISATION_EDUCATIVE("Organisation éducative et académique"),
    ASSOCIATION_ONG("Association et ONG"),
    STRUCTURE_LOCALE("Structure locale et institutionnelle"),
    EQUIPE_ESPORT("Équipe esport, club gaming"),
    GUILDE_CLAN("Guilde ou clans dans les jeux"),
    ASSOCIATION_GAMING("Association gaming"),
    ORGANISATION_ACADEMIQUE_ESPORT("Organisation académique esport"),
    SERVEUR_PLATEFORME("Serveur ou plateforme spécifique"),
    CLUB_LIGUE_AMATEUR("Club ou ligue amateurs");

    private final String label;

    StructureTypeEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
