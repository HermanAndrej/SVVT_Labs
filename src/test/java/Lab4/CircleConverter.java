package Lab4;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class CircleConverter implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        String[] radiusArr = ((String) source).split(",");
        int radius = Integer.parseInt(radiusArr[0]);
        return new Circle(radius);
    }
}
