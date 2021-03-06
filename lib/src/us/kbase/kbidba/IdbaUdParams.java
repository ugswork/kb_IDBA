
package us.kbase.kbidba;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: idba_ud_Params</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "read_libraries",
    "output_contigset_name",
    "min_contig_arg",
    "kval_args"
})
public class IdbaUdParams {

    @JsonProperty("workspace_name")
    private java.lang.String workspaceName;
    @JsonProperty("read_libraries")
    private List<String> readLibraries;
    @JsonProperty("output_contigset_name")
    private java.lang.String outputContigsetName;
    @JsonProperty("min_contig_arg")
    private Long minContigArg;
    /**
     * <p>Original spec-file type: kval_args_type</p>
     * <pre>
     * Input parameters for running idba_ud.
     * string workspace_name - the name of the workspace from which to take
     *    input and store output.
     * list<paired_end_lib> read_libraries - Illumina PairedEndLibrary files
     *     to assemble.
     * string output_contigset_name - the name of the output contigset
     * </pre>
     * 
     */
    @JsonProperty("kval_args")
    private KvalArgsType kvalArgs;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("workspace_name")
    public java.lang.String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public IdbaUdParams withWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("read_libraries")
    public List<String> getReadLibraries() {
        return readLibraries;
    }

    @JsonProperty("read_libraries")
    public void setReadLibraries(List<String> readLibraries) {
        this.readLibraries = readLibraries;
    }

    public IdbaUdParams withReadLibraries(List<String> readLibraries) {
        this.readLibraries = readLibraries;
        return this;
    }

    @JsonProperty("output_contigset_name")
    public java.lang.String getOutputContigsetName() {
        return outputContigsetName;
    }

    @JsonProperty("output_contigset_name")
    public void setOutputContigsetName(java.lang.String outputContigsetName) {
        this.outputContigsetName = outputContigsetName;
    }

    public IdbaUdParams withOutputContigsetName(java.lang.String outputContigsetName) {
        this.outputContigsetName = outputContigsetName;
        return this;
    }

    @JsonProperty("min_contig_arg")
    public Long getMinContigArg() {
        return minContigArg;
    }

    @JsonProperty("min_contig_arg")
    public void setMinContigArg(Long minContigArg) {
        this.minContigArg = minContigArg;
    }

    public IdbaUdParams withMinContigArg(Long minContigArg) {
        this.minContigArg = minContigArg;
        return this;
    }

    /**
     * <p>Original spec-file type: kval_args_type</p>
     * <pre>
     * Input parameters for running idba_ud.
     * string workspace_name - the name of the workspace from which to take
     *    input and store output.
     * list<paired_end_lib> read_libraries - Illumina PairedEndLibrary files
     *     to assemble.
     * string output_contigset_name - the name of the output contigset
     * </pre>
     * 
     */
    @JsonProperty("kval_args")
    public KvalArgsType getKvalArgs() {
        return kvalArgs;
    }

    /**
     * <p>Original spec-file type: kval_args_type</p>
     * <pre>
     * Input parameters for running idba_ud.
     * string workspace_name - the name of the workspace from which to take
     *    input and store output.
     * list<paired_end_lib> read_libraries - Illumina PairedEndLibrary files
     *     to assemble.
     * string output_contigset_name - the name of the output contigset
     * </pre>
     * 
     */
    @JsonProperty("kval_args")
    public void setKvalArgs(KvalArgsType kvalArgs) {
        this.kvalArgs = kvalArgs;
    }

    public IdbaUdParams withKvalArgs(KvalArgsType kvalArgs) {
        this.kvalArgs = kvalArgs;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((("IdbaUdParams"+" [workspaceName=")+ workspaceName)+", readLibraries=")+ readLibraries)+", outputContigsetName=")+ outputContigsetName)+", minContigArg=")+ minContigArg)+", kvalArgs=")+ kvalArgs)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
