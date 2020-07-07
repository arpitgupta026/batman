package com.batman.core.core.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

  @JsonProperty(value = "Category ID")
  @ValueMapValue
  private String categoryId;

  @JsonIgnore
  @ValueMapValue
  private String categoryUrl;

  @ValueMapValue(name = "sling:resourceType")
  private String resourceType;

  public String getCategoryName() {
    return categoryName;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public String getCategoryUrl() {
    return categoryUrl;
  }

  public String getResourceType() {
    return resourceType;
  }
}
