class SimCard {
    String provider;
    String type;
    int dataLimit;

    
    SimCard(String providerLocal, String typeLocal, int dataLimitLocal) {
        provider = providerLocal;
        type = typeLocal;
        dataLimit = dataLimitLocal;
    }
}