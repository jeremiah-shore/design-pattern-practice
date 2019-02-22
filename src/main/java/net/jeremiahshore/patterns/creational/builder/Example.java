package net.jeremiahshore.patterns.creational.builder;

public class Example {

    private String requiredData;
    private String optionalData;

    public String getRequiredData() {
        return requiredData;
    }

    public String getOptionalData() {
        return optionalData;
    }

    private Example(ExampleBuilder builder) {
        this.requiredData = builder.requiredData;
        this.optionalData = builder.optionalData;
    }

    public static class ExampleBuilder {

        private String requiredData;
        private String optionalData;

        public ExampleBuilder(String requiredData) {
            this.requiredData = requiredData;
        }

        public ExampleBuilder setOptionalData(String optionalData) {
            this.optionalData = optionalData;
            return this;
        }

        public Example build() {
            return new Example(this);
        }

    }

}
