package org.yevtsy.hackerrank.cracking.interview.data.structure.list;

import lombok.Builder;
import lombok.Data;

@Builder(toBuilder = true)
@Data
public class Node {
    int data;
    Node next;
}
