package by.tc.task01.filter;

import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceFilter {

     List<String> filterAll(Criteria criteria);
}
