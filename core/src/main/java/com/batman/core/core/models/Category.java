package com.batman.core.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
    resourceType = "batman/components/content/category",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = "jackson", extensions = "json")
public class Category {

  @ValueMapValue
  private String categoryName;

  @ValueMapValue
  private String categoryId;

  public String getCategoryName() {
    return categoryName;
  }

  public String getCategoryId() {
    return categoryId;
  }
}
