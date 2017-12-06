import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProverbTest {

    @Test
    public void testSingleConsequence() {
        String proverb  = new Proverb("nail", "shoe").getProverb(),
               expected = "For want of a nail the shoe was lost.\n" +
                          "And all for the want of a nail.";

        assertThat(proverb, is(expected));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testShortChainOfConsequences() {
        String proverb  = new Proverb("nail", "shoe", "horse").getProverb(),
               expected = "For want of a nail the shoe was lost.\n" +
                          "For want of a shoe the horse was lost.\n" +
                          "And all for the want of a nail.";

        assertThat(proverb, is(expected));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testLongerChainOfConsequences() {
        String proverb  = new Proverb("nail", "shoe", "horse", "rider").getProverb(),
               expected = "For want of a nail the shoe was lost.\n" +
                          "For want of a shoe the horse was lost.\n" +
                          "For want of a horse the rider was lost.\n" +
                          "And all for the want of a nail.";

        assertThat(proverb, is(expected));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testConsequencesAreNotHardCoded() {
        String proverb  = new Proverb("foo", "bar").getProverb(),
               expected = "For want of a foo the bar was lost.\n" +
                          "And all for the want of a foo.";

        assertThat(proverb, is(expected));
    }

}

// Test suite from RUBY exercise
//   def test_the_whole_proverb
//     skip
//     chain = %w(nail shoe horse rider message battle kingdom)
//     proverb = Proverb.new(*chain)
//     expected = "For want of a nail the shoe was lost.\n" \
//       "For want of a shoe the horse was lost.\n" \
//       "For want of a horse the rider was lost.\n" \
//       "For want of a rider the message was lost.\n" \
//       "For want of a message the battle was lost.\n" \
//       "For want of a battle the kingdom was lost.\n" \
//       'And all for the want of a nail.'
//     assert_equal expected, proverb.to_s
//   end
//
//   def test_an_optional_qualifier_in_the_final_consequence
//     skip
//     chain = %w(nail shoe horse rider message battle kingdom)
//     proverb = Proverb.new(*chain, qualifier: 'horseshoe')
//     expected = "For want of a nail the shoe was lost.\n" \
//       "For want of a shoe the horse was lost.\n" \
//       "For want of a horse the rider was lost.\n" \
//       "For want of a rider the message was lost.\n" \
//       "For want of a message the battle was lost.\n" \
//       "For want of a battle the kingdom was lost.\n" \
//       'And all for the want of a horseshoe nail.'
//     assert_equal expected, proverb.to_s
//   end
//
//   def test_proverb_is_same_each_time
//     skip
//     proverb = Proverb.new('nail', 'shoe')
//     assert_equal proverb.to_s, proverb.to_s
//   end
// end
