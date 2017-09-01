package org.yevtsy.hackerrank.cracking.interview.data.structure

import spock.lang.Specification

class ArrayLeftRotationTest extends Specification {

    def "w/o rotation"() {
        given:
        int[] input = [1, 2, 3, 4, 5]

        when:
        def rotated = arrayLeftRotation(input, input.size(), 0)

        then:
        input == rotated
    }

    def "k = 4 rotation"() {
        given:
        int[] input = [1, 2, 3, 4, 5]

        when:
        def rotated = arrayLeftRotation(input, input.size(), 4)

        then:
        rotated == [5, 1, 2, 3, 4]
    }
}
