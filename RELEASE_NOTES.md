### Version 0.0.1
__Initial version of the wrapper for IDBA-UD assembler__
- IDBA is in https://github.com/loneknightpy/idba. Version 1.1.3
- This module uses fq2fa to convert the input paired end library from fastq to fasta format
- The fasta file is given as input to idba_ud as described in the above page
- The assembler is recompiled to support longer reads upto 512bp
