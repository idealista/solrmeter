package com.idealista.solrmeter.mock;

import org.apache.solr.client.solrj.SolrQuery;

import com.idealista.solrmeter.model.generator.ExternalFileQueryGenerator;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class ExternalFileQueryGeneratorSpy extends ExternalFileQueryGenerator {


    @Override
    public List<String> getParamsFrom(String queryString) throws UnsupportedEncodingException {
        return super.getParamsFrom(queryString);
    }

    @Override
    public List<String> getKeyValuePair(String queryString) throws UnsupportedEncodingException {
        return super.getKeyValuePair(queryString);
    }

    @Override
    public List<String> split(String queryString, String separator) throws UnsupportedEncodingException {
        return super.split(queryString, separator);
    }

    @Override
    public SolrQuery fromString(String queryString) {
        return super.fromString(queryString);
    }
}
