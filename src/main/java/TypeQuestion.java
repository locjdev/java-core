public class TypeQuestion {
    int typeID;
    TypeName typeName;

    public TypeQuestion(int typeID, TypeName typeName) {
        this.typeID = typeID;
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "TypeQuestion{" +
                "typeID=" + typeID +
                ", typeName=" + typeName +
                '}';
    }
}
