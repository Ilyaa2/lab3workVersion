package utility;

public enum Status {
    NORMAL("Чувствует нормально"),
    DISTRACTED("Отвлекся и задумался"),
    HUNGRY("Испытывает голод"),
    SCARED("Напуган"),
    RESTED("Отдохнул"),
    HALLUCINATED("Думает о плохом, нагнетает саспенс"),
    BLEED("Кровоточит"),
    ANGRY("Разъярен"),
    FROSEN("Замерз");


    final String DESCRIPTION;

    private Status(String Description) {
        this.DESCRIPTION = Description;
    }

    public String getDescription() {
        return DESCRIPTION;
    }

}
