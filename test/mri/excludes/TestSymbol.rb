exclude :test_inspect, "needs investigation"
exclude :test_to_proc_arg, "we have plans to do different caching here, see 69662ab8cd1616a2ee076488226a473648fc6267"
exclude :test_to_proc_binding, "needs investigation #4303"
exclude :test_to_proc_iseq, "needs investigation #4303"
exclude :test_to_proc_new_proc, "works but 'Timeout::Error: execution of assert_ruby_status expired\npid 28347 exit 143' on CI, moved to jruby/test_symbol.rb"
exclude :test_to_proc_no_method, "works but 'assert_separately failed\npid 28416 exit 143' on CI, moved to jruby/test_symbol.rb"
exclude :test_to_proc_yield, "works but 'Timeout::Error: execution of assert_ruby_status expired\npid 28480 exit 143' on CI, moved to jruby/test_symbol.rb"
exclude :test_symbol_encoding, "needs investigation"
exclude :test_to_proc_arg_with_refinements, "[2.6] fails:  undefined method `hoge' for #<TestSymbol::TestToPRocArgWithRefinements:0xc267ef4>"
exclude :test_to_proc_arg_with_refinements_override, "[2.6] fails:  undefined method `hoge' for #<TestSymbol::TestToPRocArgWithRefinements:0xc267ef4>"
exclude :test_symbol_fstr_memory_leak, "no working assert_no_memory_leak method"
