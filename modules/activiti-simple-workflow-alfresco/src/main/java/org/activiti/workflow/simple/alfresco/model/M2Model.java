/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.workflow.simple.alfresco.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="model")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={
	"name", "description", "author", "version", "imports", "namespaces", "constraints", "types",
	"aspects"
})
public class M2Model {

	@XmlAttribute
	private String name = null;
	private String description = null;
	private String author = null;
	private String version;

	@XmlElementWrapper(name="namespaces")
	@XmlElement(name="namespace")
	private List<M2Namespace> namespaces;
	
	@XmlElementWrapper(name="imports")
	@XmlElement(name="import")
	private List<M2Namespace> imports;
	
	@XmlElementWrapper(name="types")
	@XmlElement(name="type")
	private List<M2Type> types;
	
	@XmlElementWrapper(name="aspects")
	@XmlElement(name="aspect")
	private List<M2Aspect> aspects;
	
	@XmlElementWrapper(name="constraints")
	@XmlElement(name="constraint")
	private List<M2Constraint> constraints;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<M2Namespace> getNamespaces() {
		ensureNamespacesInitialized();
		return namespaces;
	}

	public void setNamespaces(List<M2Namespace> namespaces) {
		this.namespaces = namespaces;
	}

	public List<M2Namespace> getImports() {
		ensureImportsInitialized();
		return imports;
	}

	public void setImports(List<M2Namespace> imports) {
		this.imports = imports;
	}

	public List<M2Type> getTypes() {
		ensureTypesInitialized();
		return types;
	}

	public void setTypes(List<M2Type> types) {
		this.types = types;
	}

	public List<M2Aspect> getAspects() {
		ensureAspectsInitialized();
		return aspects;
	}

	public void setAspects(List<M2Aspect> aspects) {
		this.aspects = aspects;
	}

	public List<M2Constraint> getConstraints() {
		ensureConstraintsInitialized();
		return constraints;
	}

	public void setConstraints(List<M2Constraint> constraints) {
		this.constraints = constraints;
	}
	
	private void ensureNamespacesInitialized() {
		if(namespaces == null) {
			namespaces = new ArrayList<M2Namespace>();
		}
  }
	
	private void ensureImportsInitialized() {
		if(imports == null) {
			imports = new ArrayList<M2Namespace>();
		}
	}
	
	private void ensureConstraintsInitialized() {
		if(constraints == null) {
			constraints = new ArrayList<M2Constraint>();
		}
	}
	
	private void ensureTypesInitialized() {
		if(types == null) {
			types = new ArrayList<M2Type>();
		}
	}
	
	private void ensureAspectsInitialized() {
		if(aspects == null) {
			aspects = new ArrayList<M2Aspect>();
		}
	}
}
