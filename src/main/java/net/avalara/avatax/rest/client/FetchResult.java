package net.avalara.avatax.rest.client;

import java.util.ArrayList;
import java.util.List;

public class FetchResult<T> {
    private int count;
    private List<T> value;
    private String nextLink;

    public FetchResult() {
        value = new ArrayList<T>();
        count = 0;
    }

    /**
     * Construct this from a different FetchResult, but maintain the count
     */
    public FetchResult(int originalRowCount, List<T> newlist) {
        this.count = originalRowCount;
        this.value = newlist;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getValue() {
        return this.value;
    }

    public void setValue(List<T> value) {
        this.value = value;
    }

    public String getNextLink() {
        return this.nextLink;
    }

    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("class FetchResult {\n");
        builder.append("  count: ").append(count).append("\n");
        builder.append("  value: [").append("\n");

        for (T obj : value) {
            builder.append("    ").append(obj).append("\n");
        }

        builder.append("  ]").append("\n");
        builder.append("  @nextLink: ").append(nextLink).append("\n");
        builder.append("}\n");
        return builder.toString();
    }
}