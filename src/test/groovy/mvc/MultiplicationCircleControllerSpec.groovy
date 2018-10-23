package mvc

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link ControllerUnitTest} for usage instructions.
 */
class MultiplicationCircleControllerSpec extends Specification implements ControllerUnitTest<MultiplicationCircleController> {

    @Unroll
    void "asking for #segments segments should provide #segments lines"(segments) {
        given:
        def model = new MultiplicationCircleModel(segmentCount: segments, tableBase: 10)
        when:
        controller.index(model)
        then:
        model.lines.size() == segments
        model.tableBase == 10
        where:
        segments << [0, 1, 10, 100]
    }
}
